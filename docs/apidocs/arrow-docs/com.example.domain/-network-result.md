---
title: NetworkResult - arrow-docs
---

[arrow-docs](../index.html) / [com.example.domain](index.html) / [NetworkResult](./-network-result.html)

# NetworkResult

`sealed class NetworkResult`

### Companion Object Extension Properties

| [networkError](network-error.html) | `val NetworkResult.Companion.networkError: Prism<`[`NetworkResult`](./-network-result.html)`, `[`NetworkError`](-network-error.html)`>` |
| [success](success.html) | `val NetworkResult.Companion.success: Prism<`[`NetworkResult`](./-network-result.html)`, `[`Success`](-success/index.html)`>` |

### Inheritors

| [NetworkError](-network-error.html) | `sealed class NetworkError : `[`NetworkResult`](./-network-result.html) |
| [Success](-success/index.html) | `data class Success : `[`NetworkResult`](./-network-result.html) |

