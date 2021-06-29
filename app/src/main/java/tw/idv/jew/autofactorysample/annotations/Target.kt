package tw.idv.jew.autofactorysample.annotations

import kotlin.annotation.Target

@Target(AnnotationTarget.ANNOTATION_CLASS)
@MustBeDocumented
annotation class Target(vararg val allowedTargets: AnnotationTarget)

@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class Retention(val value: AnnotationRetention = AnnotationRetention.RUNTIME)