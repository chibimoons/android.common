package com.chibimoons.common.base;


public interface ICompletableUsecase<P> {
    Comparable execute(P parameter);
}
