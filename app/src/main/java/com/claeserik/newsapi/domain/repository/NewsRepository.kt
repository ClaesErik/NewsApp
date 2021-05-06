package com.claeserik.newsapi.domain.repository

import androidx.lifecycle.LiveData
import com.claeserik.newsapi.data.model.APIResponse
import com.claeserik.newsapi.data.model.Article
import com.claeserik.newsapi.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery:String): Resource<APIResponse>
    suspend fun saveNews(article: Article): Resource<APIResponse>
    suspend fun deleteNews(article: Article): Resource<APIResponse>
    fun getSavedNews(): Flow<List<Article>>

}