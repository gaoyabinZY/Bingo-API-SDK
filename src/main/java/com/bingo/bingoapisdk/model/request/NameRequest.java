package com.bingo.bingoapisdk.model.request;

import com.bingo.bingoapisdk.model.response.NameResponse;
import com.bingo.bingoapisdk.model.enums.RequestMethodEnum;
import com.bingo.bingoapisdk.model.params.NameParams;
import lombok.experimental.Accessors;

/**
 * @Author: Bingo
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description:
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
