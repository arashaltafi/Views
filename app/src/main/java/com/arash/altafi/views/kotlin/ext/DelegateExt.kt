package com.arash.altafi.views.kotlin.ext

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

val Any.lazyY by Delegates.observable(Any()) { kProperty: KProperty<*>, any: Any, any1: Any ->
    kProperty.getter
}