package com.claeserik.newsapi.domain.usecase

import com.claeserik.newsapi.data.model.APIResponse
import com.claeserik.newsapi.data.util.Resource
import com.claeserik.newsapi.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines()
    }

}