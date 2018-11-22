---
title: NetworkError - arrow-docs
---

[arrow-docs](../index.html) / [com.example.domain](index.html) / [NetworkError](./-network-error.html)

# NetworkError

`sealed class NetworkError : `[`NetworkResult`](-network-result.html)

### Companion Object Extension Properties

| [httpError](http-error.html) | `val NetworkError.Companion.httpError: Prism<`[`NetworkError`](./-network-error.html)`, `[`HttpError`](-http-error/index.html)`>` |
| [timeoutError](timeout-error.html) | `val NetworkError.Companion.timeoutError: Prism<`[`NetworkError`](./-network-error.html)`, `[`TimeoutError`](-timeout-error.html)`>` |

### Inheritors

| [HttpError](-http-error/index.html) | `data class HttpError : `[`NetworkError`](./-network-error.html) |
| [TimeoutError](-timeout-error.html) | `object TimeoutError : `[`NetworkError`](./-network-error.html) |

