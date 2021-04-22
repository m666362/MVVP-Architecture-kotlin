package com.mindorks.framework.mvvmarchitecture.Data.Api

import com.mindorks.framework.mvvmarchitecture.Data.Model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}