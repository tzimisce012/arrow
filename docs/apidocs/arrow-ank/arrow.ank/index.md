---
title: arrow.ank - arrow-ank
---

[arrow-ank](../index.html) / [arrow.ank](./index.html)

## Package arrow.ank

### Types

| [CompiledMarkdown](-compiled-markdown/index.html) | `data class CompiledMarkdown` |
| [Snippet](-snippet/index.html) | `data class Snippet` |

### Exceptions

| [CompilationException](-compilation-exception/index.html) | `data class CompilationException : `[`NoStackTrace`](-no-stack-trace/index.html) |
| [NoStackTrace](-no-stack-trace/index.html) | `abstract class NoStackTrace : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |

### Extensions for External Classes

| [kotlin.Long](kotlin.-long/index.html) |  |

### Properties

| [ANSI_BLACK](-a-n-s-i_-b-l-a-c-k.html) | `const val ANSI_BLACK: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ANSI_BLUE](-a-n-s-i_-b-l-u-e.html) | `const val ANSI_BLUE: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ANSI_CYAN](-a-n-s-i_-c-y-a-n.html) | `const val ANSI_CYAN: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ANSI_GREEN](-a-n-s-i_-g-r-e-e-n.html) | `const val ANSI_GREEN: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ANSI_PURPLE](-a-n-s-i_-p-u-r-p-l-e.html) | `const val ANSI_PURPLE: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ANSI_RED](-a-n-s-i_-r-e-d.html) | `const val ANSI_RED: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ANSI_RESET](-a-n-s-i_-r-e-s-e-t.html) | `const val ANSI_RESET: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ANSI_WHITE](-a-n-s-i_-w-h-i-t-e.html) | `const val ANSI_WHITE: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ANSI_YELLOW](-a-n-s-i_-y-e-l-l-o-w.html) | `const val ANSI_YELLOW: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [AnkBlock](-ank-block.html) | `const val AnkBlock: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [AnkHeader](-ank-header.html) | `val AnkHeader: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [AnkOutFileBlock](-ank-out-file-block.html) | `const val AnkOutFileBlock: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [AnkReplaceBlock](-ank-replace-block.html) | `const val AnkReplaceBlock: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [AnkSilentBlock](-ank-silent-block.html) | `const val AnkSilentBlock: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [SupportedMarkdownExtensions](-supported-markdown-extensions.html) | `val SupportedMarkdownExtensions: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [ankMacroRegex](ank-macro-regex.html) | `val ankMacroRegex: `[`Regex`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-regex/index.html) |
| [extensionMappings](extension-mappings.html) | `val extensionMappings: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |

### Functions

| [ank](ank.html) | `fun ank(source: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, target: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, compilerArgs: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`>` |
| [colored](colored.html) | `fun colored(color: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [compileCode](compile-code.html) | `fun compileCode(snippets: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Snippet`](-snippet/index.html)`>>, compilerArgs: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CompiledMarkdown`](-compiled-markdown/index.html)`>` |
| [compileCodeImpl](compile-code-impl.html) | `fun compileCodeImpl(snippets: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Snippet`](-snippet/index.html)`>>, classpath: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): ListK<`[`CompiledMarkdown`](-compiled-markdown/index.html)`>` |
| [createTarget](create-target.html) | `fun createTarget(source: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, target: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html) |
| [createTargetImpl](create-target-impl.html) | `fun createTargetImpl(source: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, target: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html) |
| [extractCode](extract-code.html) | `fun extractCode(source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, tree: ASTNode): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Snippet`](-snippet/index.html)`>` |
| [extractCodeImpl](extract-code-impl.html) | `fun extractCodeImpl(source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, tree: ASTNode): ListK<`[`Snippet`](-snippet/index.html)`>` |
| [generateFile](generate-file.html) | `fun generateFile(candidate: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, newContents: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html) |
| [generateFileImpl](generate-file-impl.html) | `fun generateFileImpl(file: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, contents: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html) |
| [getFileCandidates](get-file-candidates.html) | `fun getFileCandidates(target: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`>` |
| [getFileCandidatesImpl](get-file-candidates-impl.html) | `fun getFileCandidatesImpl(target: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): ListK<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`>` |
| [main](main.html) | `fun main(vararg args: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [parseMarkDownImpl](parse-mark-down-impl.html) | `fun parseMarkDownImpl(markdown: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): ASTNode` |
| [parseMarkdown](parse-markdown.html) | `fun parseMarkdown(markdown: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): ASTNode` |
| [preProcessMacros](pre-process-macros.html) | `fun preProcessMacros(source: Tuple2<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [preProcessMacrosImpl](pre-process-macros-impl.html) | `fun preProcessMacrosImpl(source: Tuple2<`[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [readFile](read-file.html) | `fun readFile(source: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [readFileImpl](read-file-impl.html) | `fun readFileImpl(source: `[`File`](http://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [replaceAnkToLang](replace-ank-to-lang.html) | `fun replaceAnkToLang(compilationResults: `[`CompiledMarkdown`](-compiled-markdown/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [replaceAnkToLangImpl](replace-ank-to-lang-impl.html) | `fun replaceAnkToLangImpl(compiledMarkdown: `[`CompiledMarkdown`](-compiled-markdown/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

