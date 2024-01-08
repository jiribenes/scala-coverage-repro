## Scala coverage repro repo

### How to reproduce (in Scala 3.3.1)

Use `sbt testCoverage` to generate an HTML report, then open it in your browser.
Both the codegrid and the statement list views show that the array we're iterating over isn't covered:

<img width="474" alt="Screenshot 2024-01-08 at 15 57 43" src="https://github.com/jiribenes/scala-coverage-repro/assets/11269173/2ee87ed5-4dad-409a-89f5-1fc68b13476c">
<img width="880" alt="Screenshot 2024-01-08 at 15 57 49" src="https://github.com/jiribenes/scala-coverage-repro/assets/11269173/a8aa6d81-91ea-4dbe-95aa-ad7509a84ca4">

### ... but it works in Scala 3.2

However, if you change the version to `scalaVersion := 3.2.0` in the `build.sbt` file, everything works as intended.
See both the codegrid and the statement list views:

<img width="442" alt="Screenshot 2024-01-08 at 15 58 25" src="https://github.com/jiribenes/scala-coverage-repro/assets/11269173/8a5a84b4-f033-4a54-8db5-58b1dab0ccf1">
<img width="859" alt="Screenshot 2024-01-08 at 15 58 29" src="https://github.com/jiribenes/scala-coverage-repro/assets/11269173/19b6ba12-89d6-4332-a0e0-4f3b5aa90961">


## More details

- also shows up when `.foreach` is used instead
- also shows up when using other iterable collections like `List[Int]`
