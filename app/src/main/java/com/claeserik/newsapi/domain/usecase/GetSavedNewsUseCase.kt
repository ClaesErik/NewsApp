package com.claeserik.newsapi.domain.usecase

import com.claeserik.newsapi.data.model.Article
import com.claeserik.newsapi.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {

    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }

}