package com.example.appportifoliogithub.data.repositories

import com.example.appportifoliogithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}