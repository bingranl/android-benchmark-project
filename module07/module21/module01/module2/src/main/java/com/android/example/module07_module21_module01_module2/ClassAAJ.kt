package com.android.example.module07_module21_module01_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAC = com.android.example.module07_module21_module01_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAE = com.android.example.module07_module21_module01_module5.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module5.ClassAAH = com.android.example.module07_module21_module01_module5.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module07_module21_module01_module5.ClassAAJ = com.android.example.module07_module21_module01_module5.ClassAAJ()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.dispose()

		val local_var_2_2: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_2.start()

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		} else {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.dispose()

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAF,
		param1: com.android.example.module07_module21_module01_module5.ClassAAJ,
		param2: com.android.example.module07_module21_module01_module5.ClassAAA,
		param3: com.android.example.module07_module21_module01_module5.ClassAAC
	) {
		param0.method1(io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(6804739725918796205)

		param0.method0(io.reactivex.subscribers.TestSubscriber())

		param0.method1(io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAF,
		param1: com.android.example.module07_module21_module01_module5.ClassAAD,
		param2: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module5.ClassAAH
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

	}

	fun method4(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG,
		param1: com.android.example.module07_module21_module01_module5.ClassAAF,
		param2: com.android.example.module07_module21_module01_module5.ClassAAF
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

	}
}
