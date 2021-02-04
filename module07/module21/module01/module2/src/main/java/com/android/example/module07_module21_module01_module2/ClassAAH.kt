package com.android.example.module07_module21_module01_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAA = com.android.example.module07_module21_module01_module5.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAA = com.android.example.module07_module21_module01_module5.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module5.ClassAAJ = com.android.example.module07_module21_module01_module5.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module07_module21_module01_module5.ClassAAF = com.android.example.module07_module21_module01_module5.ClassAAF()
	private 	val instance_var_1_4: com.android.example.module07_module21_module01_module5.ClassAAE = com.android.example.module07_module21_module01_module5.ClassAAE()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAH,
		param1: com.android.example.module07_module21_module01_module5.ClassAAI,
		param2: com.android.example.module07_module21_module01_module5.ClassAAB,
		param3: com.android.example.module07_module21_module01_module5.ClassAAH
	) {
	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAD,
		param1: com.android.example.module07_module21_module01_module5.ClassAAE,
		param2: com.android.example.module07_module21_module01_module5.ClassAAG,
		param3: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		param0.method0(io.reactivex.subscribers.TestSubscriber())

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
			local_var_3_0.dispose()

		}
		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.hasSubscription()

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAC,
		param1: com.android.example.module07_module21_module01_module5.ClassAAC,
		param2: com.android.example.module07_module21_module01_module5.ClassAAH
	) {
		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module5.ClassAAD,
		param1: com.android.example.module07_module21_module01_module5.ClassAAH,
		param2: com.android.example.module07_module21_module01_module5.ClassAAF
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method4(
		param0: com.android.example.module07_module21_module01_module5.ClassAAI,
		param1: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.isDisposed()

	}
}
