# Gradle Multi-Java-Modules Sample

This project shows how to organize Java modules in a Gradle project.

Modules:

* `example-api` - the API shared by all modules.
* `example-core` - the "core" application.
* `example-in-memory-data` - an in-memory data provider. 

This project is used as an example of a multi-module project in my blog post about Gradle:
[Why Gradle is loathed while actually being great!](https://renato.athaydes.com/posts/gradle-loathed-but-great.html).

### Build

```bash
$ gradle build
```

### Run

```bash
$ java --module-path=build/mods --module=example.core/example.core.App <argument>
```
