# LeetCode Problems — Java

This repository is a curated collection of Java solutions to LeetCode problems, small algorithm demos, and refresher examples intended for interview practice and skill building.

Author profile
- LeetCode: https://leetcode.com/u/savinash273/

Repository layout (high level)

- `src/main/java/` — Java source tree:
  - `org.code/`        : LeetCode solutions and problem implementations.
  - `org.refresher/`   : Small examples and design-pattern refreshers.
  - `org.apple/`       : Sample entrypoint (see [`src/main/java/org/apple/AppleMain.java`](src/main/java/org/apple/AppleMain.java:1)).

Quickstart

Prerequisites

- Java 11 or later installed and available on your PATH. Verify with:

```sh
java -version
```

Compile all sources (simple, no build tool):

```sh
mkdir -p out
javac -d out $(find src/main/java -name "*.java")
```

Run the sample entrypoint:

```sh
java -cp out org.apple.AppleMain
```

Run one file quickly (JDK single-file mode):

```sh
java src/main/java/org/apple/AppleMain.java
```

Recommended next steps

- Add a build tool (Maven or Gradle) to manage compilation and testing.
- Add unit tests (JUnit) for representative problem solutions and enable CI (GitHub Actions).
- Apply consistent formatting and static analysis (google-java-format, Checkstyle, SpotBugs).
- Reorganize problem solutions into topic-based packages (arrays, trees, graphs) and add per-package READMEs.

Contributing

- Fork the repository, make focused changes, and open a pull request. Include tests for functional changes and keep commits atomic.

License

- No license is included. Add a LICENSE file (e.g., MIT or Apache-2.0) if you intend to publish this repository publicly.

Files of interest

- Entry point: [`src/main/java/org/apple/AppleMain.java`](src/main/java/org/apple/AppleMain.java:1)
