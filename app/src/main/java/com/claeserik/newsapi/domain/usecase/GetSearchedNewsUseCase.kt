package com.claeserik.newsapi.domain.usecase

import com.claeserik.newsapi.data.model.APIResponse
import com.claeserik.newsapi.data.util.Resource
import com.claeserik.newsapi.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(searchedQuery: String): Resource<APIResponse>{
        return newsRepository.getSearchedNews(searchedQuery)
    }

}