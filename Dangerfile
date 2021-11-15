# Make it more obvious that a PR is a work in progress and shouldn't be merged yet
warn("PR is classed as Work in Progress") if github.pr_title.include? "[WIP]"

# Warn when there is a big PR
warn("Big PR") if git.lines_of_code > 500

# Android Lint
android_lint.gradle_task = "app:lint"
android_lint.report_file = "app/build/reports/lint-results.xml"
android_lint.filtering = true
android_lint.lint(inline_mode: true)

`./gradlew :app:dependencies --configuration releaseRuntimeClasspath > old.txt`
`./gradlew :app:dependencies --configuration releaseRuntimeClasspath > new.txt`
DIFF=`diff old.txt new.txt`
warn(DIFF) if DIFF.length > 0
