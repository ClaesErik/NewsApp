package com.claeserik.newsapi.domain.usecase

import com.claeserik.newsapi.data.model.APIResponse
import com.claeserik.newsapi.data.model.Article
import com.claeserik.newsapi.data.util.Resource
import com.claeserik.newsapi.domain.repository.NewsRepository

class DeletedSavedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(article: Article): Resource<APIResponse> = newsRepository.deleteNews(article)
}