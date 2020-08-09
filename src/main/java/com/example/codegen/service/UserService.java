package com.example.codegen.service;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.core.Future;

@ProxyGen
public interface UserService {
  Future<Void> sayHello();
  Future<Void> sayHello2();
}
