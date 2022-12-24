package com.example.snailpasswordmanager.domain.usecase.passwords;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/snailpasswordmanager/domain/usecase/passwords/InsertPassword;", "", "recordListRepository", "Lcom/example/snailpasswordmanager/domain/repository/RecordListRepository;", "(Lcom/example/snailpasswordmanager/domain/repository/RecordListRepository;)V", "invoke", "", "passwordEntity", "Lcom/example/snailpasswordmanager/domain/model/RecordEntity;", "(Lcom/example/snailpasswordmanager/domain/model/RecordEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class InsertPassword {
    private final com.example.snailpasswordmanager.domain.repository.RecordListRepository recordListRepository = null;
    
    @javax.inject.Inject()
    public InsertPassword(@org.jetbrains.annotations.NotNull()
    com.example.snailpasswordmanager.domain.repository.RecordListRepository recordListRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.example.snailpasswordmanager.domain.model.InvalidRecordException.class})
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    com.example.snailpasswordmanager.domain.model.RecordEntity passwordEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}