package com.mindorks.framework.mvvmarchitecture.Data.Api

class ApiHelper (private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}