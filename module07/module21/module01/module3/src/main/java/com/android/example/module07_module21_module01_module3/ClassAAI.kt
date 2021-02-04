package com.android.example.module07_module21_module01_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAB = com.android.example.module07_module21_module01_module5.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module2.ClassAAD = com.android.example.module07_module21_module01_module2.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module2.ClassAAE = com.android.example.module07_module21_module01_module2.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module07_module21_module01_module5.ClassAAB = com.android.example.module07_module21_module01_module5.ClassAAB()
	private 	val instance_var_1_4: com.android.example.module07_module21_module01_module2.ClassAAF = com.android.example.module07_module21_module01_module2.ClassAAF()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAJ,
		param1: com.android.example.module07_module21_module01_module5.ClassAAD
	) {
	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG,
		param1: com.android.example.module07_module21_module01_module2.ClassAAD,
		param2: com.android.example.module07_module21_module01_module2.ClassAAG
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module5.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

	}
}
