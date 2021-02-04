package com.android.example.module07_module21_module02_module1_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module07_module21_module02_module1_module5.ClassAAE = com.android.example.module07_module21_module02_module1_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module07_module21_module02_module1_module5.ClassAAJ = com.android.example.module07_module21_module02_module1_module5.ClassAAJ()

	fun method0(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAJ,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAG,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAA,
		param3: com.android.example.module07_module21_module02_module1_module5.ClassAAJ
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

	}

	fun method1(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAC
	) {
	}

	fun method2(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAI
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.dispose()

		if (kotlin.Any().equals(kotlin.Any())) {
			param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

		}
	}

	fun method3(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAJ
	) {
		param0.method1(io.reactivex.internal.schedulers.IoScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.dispose()

	}

	fun method4(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

		param0.method1(io.reactivex.internal.schedulers.IoScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

	}
}
