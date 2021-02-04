package com.android.example.module07_module21_module01_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAH = com.android.example.module07_module21_module01_module5.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAE = com.android.example.module07_module21_module01_module5.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module5.ClassAAA = com.android.example.module07_module21_module01_module5.ClassAAA()

	fun method0(
		param0: com.android.example.module07_module21_module01_module2.ClassAAF,
		param1: com.android.example.module07_module21_module01_module5.ClassAAD
	) {
		param0.method0(com.android.example.module07_module21_module01_module5.ClassAAF(), com.android.example.module07_module21_module01_module5.ClassAAH(), com.android.example.module07_module21_module01_module5.ClassAAC(), com.android.example.module07_module21_module01_module5.ClassAAJ())

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAA,
		param1: com.android.example.module07_module21_module01_module2.ClassAAG
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAE,
		param1: com.android.example.module07_module21_module01_module2.ClassAAD,
		param2: com.android.example.module07_module21_module01_module2.ClassAAF
	) {
		val local_var_2_3: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_3.assertNotSubscribed()

		param0.method0(io.reactivex.observers.TestObserver(), io.reactivex.schedulers.TestScheduler())

		param0.method2(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module5.ClassAAE
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.observers.TestObserver(), io.reactivex.schedulers.TestScheduler())

		param0.method2(io.reactivex.subscribers.TestSubscriber())

	}

	fun method4(
		param0: com.android.example.module07_module21_module01_module5.ClassAAE
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}
}
