pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            name = "GitLab"
            url = uri("https://gitlab.com/api/v4/projects/64441730/packages/maven")
            authentication {
                create<BasicAuthentication>("basic")
            }
            credentials {
                username = "Private-Token"
                password = ""
            }
        }
    }
}

rootProject.name = "test_android_library_jitpack_io"
include(":app")
include(":sumlib")
include(":dividelib")
include(":mathlib")
