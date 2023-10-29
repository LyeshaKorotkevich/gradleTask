package ru.clevertec.testReport;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.testing.jacoco.tasks.JacocoReport

class TestReportPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.tasks.create("generateMergedReport", JacocoReport) {

            additionalSourceDirs.setFrom(project.files(project.subprojects.collect { it.sourceSets.main.allSource.srcDirs }))
            sourceDirectories.setFrom(project.files(project.subprojects.collect { it.sourceSets.main.allSource.srcDirs }))
            classDirectories.setFrom(project.files(project.subprojects.collect { it.sourceSets.main.output }))
            executionData.setFrom(project.files(project.fileTree(dir: '.', include: '**/build/jacoco/test.exec')))
            reports {
                xml.required.set(true)
                html.required.set(true)
                csv.required.set(false)
            }
        }
    }
}
