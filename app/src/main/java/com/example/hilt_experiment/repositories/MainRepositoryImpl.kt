package com.example.hilt_experiment.repositories

import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val text: String
): MainRepository {
    override fun getText(): String {
        return text
    }
}