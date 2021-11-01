package com.example.appportifoliogithub.domain

import com.example.appportifoliogithub.core.UseCase
import com.example.appportifoliogithub.data.model.Repo
import com.example.appportifoliogithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}