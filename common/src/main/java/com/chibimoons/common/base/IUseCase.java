package com.chibimoons.common.base;

import io.reactivex.Single;

public interface IUseCase<P, R> {
    Single<R> execute(P parameter);
}
