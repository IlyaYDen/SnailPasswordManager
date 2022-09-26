package com.example.snailpasswordmanager.data

import com.example.snailpasswordmanager.domain.model.PasswordEntity
import com.example.snailpasswordmanager.domain.model.UserEntity
import com.example.snailpasswordmanager.domain.repository.UserRepository

object UserRepositoryImpl : UserRepository {

    private val UserList = mutableListOf<UserEntity>()

    private var autoIncrementid = 0;

    override fun addUser(userEntity: UserEntity) {
        if(userEntity.id == UserEntity.UNDEFINED_ID)
            userEntity.id = autoIncrementid++
        UserList.add(userEntity)
        //TODO("Not yet implemented")
    }

    override fun removeUser(userEntity: UserEntity) {
        UserList.remove(userEntity)
        //TODO("Not yet implemented")
    }

    override fun getUserList(): List<UserEntity> {
        return UserList.toList()
        //TODO("Not yet implemented")
    }

    override fun getUser(userId: Int): UserEntity? {
        return UserList.get(userId)
    //TODO("Not yet implemented")
    }


}