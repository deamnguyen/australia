package com.sotatek.api;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiResponse<T> {

  public ApiHeader header;

  public T result;


  public ApiResponse(ApiHeader header) {
    this.header = header;
  }

  public ApiResponse(ApiHeader header, T result) {
    this.header = header;
    this.result = result;
  }


}
