package com.bingo.bingoapisdk.service.impi;

import com.bingo.bingoapisdk.exception.ApiException;
import com.bingo.bingoapisdk.model.request.*;
import com.bingo.bingoapisdk.service.ApiService;
import com.bingo.bingoapisdk.service.BaseService;
import com.bingo.bingoapisdk.client.BingoApiClient;
import com.bingo.bingoapisdk.model.response.LoveResponse;
import com.bingo.bingoapisdk.model.response.PoisonousChickenSoupResponse;
import com.bingo.bingoapisdk.model.response.RandomWallpaperResponse;
import com.bingo.bingoapisdk.model.response.ResultResponse;
import lombok.extern.slf4j.Slf4j;


/**
 * @Author: Bingo
 * @Date: 2023年09月17日 08:42
 * @Version: 1.0
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(BingoApiClient qiApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(qiApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(BingoApiClient qiApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(BingoApiClient qiApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(BingoApiClient qiApiClient, HoroscopeRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(BingoApiClient qiApiClient, IpInfoRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(BingoApiClient qiApiClient, WeatherRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
