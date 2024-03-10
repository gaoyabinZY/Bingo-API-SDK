package com.bingo.bingoapisdk.service;

import cn.hutool.http.HttpResponse;
import com.bingo.bingoapisdk.exception.ApiException;
import com.bingo.bingoapisdk.client.BingoApiClient;
import com.bingo.bingoapisdk.model.request.*;
import com.bingo.bingoapisdk.model.response.LoveResponse;
import com.bingo.bingoapisdk.model.response.PoisonousChickenSoupResponse;
import com.bingo.bingoapisdk.model.response.RandomWallpaperResponse;
import com.bingo.bingoapisdk.model.response.ResultResponse;

/**
 * @Author: Bin
 * @Date: 2023年09月17日 08:34
 * @Version: 1.0
 * @Description:
 */
public interface ApiService {
    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */

    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param qiApiClient qi api客户端
     * @param request     要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(BingoApiClient qiApiClient, BaseRequest<O, T> request) throws ApiException;


    /**
     * 随机毒鸡汤
     *
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException;

    /**
     * 喝毒鸡汤
     *
     * @param qiApiClient qi api客户端
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup(BingoApiClient qiApiClient) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param request 要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param qiApiClient qi api客户端
     * @param request     要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(BingoApiClient qiApiClient, RandomWallpaperRequest request) throws ApiException;

    /**
     * 随意情话
     *
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk() throws ApiException;

    /**
     * 随意情话
     *
     * @param qiApiClient qi api客户端
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk(BingoApiClient qiApiClient) throws ApiException;

    /**
     * 星座运势
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(HoroscopeRequest request) throws ApiException;

    /**
     * 星座运势
     *
     * @param qiApiClient qi api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(BingoApiClient qiApiClient, HoroscopeRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param qiApiClient qi api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(BingoApiClient qiApiClient, IpInfoRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(IpInfoRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param qiApiClient qi api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(BingoApiClient qiApiClient, WeatherRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException;
}
