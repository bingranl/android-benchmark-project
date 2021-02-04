package com.android.example.module07_module21_module01_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAE = com.android.example.module07_module21_module01_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAB = com.android.example.module07_module21_module01_module5.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module5.ClassAAC = com.android.example.module07_module21_module01_module5.ClassAAC()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAH,
		param1: com.android.example.module07_module21_module01_module5.ClassAAF,
		param2: com.android.example.module07_module21_module01_module5.ClassAAD
	) {
		for (iAb in 0..6) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

		}
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.util.LinkedArrayList(32))

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAF,
		param1: com.android.example.module07_module21_module01_module5.ClassAAF
	) {
		param0.method1(io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG,
		param1: com.android.example.module07_module21_module01_module5.ClassAAD,
		param2: com.android.example.module07_module21_module01_module5.ClassAAE,
		param3: com.android.example.module07_module21_module01_module5.ClassAAD
	) {
		param0.method1(io.reactivex.schedulers.TestScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

		param0.method1(io.reactivex.schedulers.TestScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG,
		param1: com.android.example.module07_module21_module01_module5.ClassAAC,
		param2: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

	}
}
