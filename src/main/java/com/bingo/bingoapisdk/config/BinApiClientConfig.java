package com.bingo.bingoapisdk.config;

import com.bingo.bingoapisdk.service.ApiService;
import com.bingo.bingoapisdk.service.impi.ApiServiceImpl;
import com.bingo.bingoapisdk.client.BingoApiClient;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Bingo
 * @Date: 2023年08月17日 21:09
 * @Version: 1.0
 * @Description:
 */
@Data
@Configuration
@ConfigurationProperties("bin.api.client")
@ComponentScan
public class BinApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public BingoApiClient qiApiClient() {
        return new BingoApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setQiApiClient(new BingoApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
