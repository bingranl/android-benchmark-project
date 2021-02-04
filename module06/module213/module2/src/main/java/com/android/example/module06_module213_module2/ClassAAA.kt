package com.android.example.module06_module213_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module213_module5.ClassAAE = com.android.example.module06_module213_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module213_module5.ClassAAC = com.android.example.module06_module213_module5.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module06_module213_module5.ClassAAE = com.android.example.module06_module213_module5.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module213_module5.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
			local_var_3_0.dispose()

		} else {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.clear()

		}
		param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module213_module5.ClassAAG,
		param1: com.android.example.module06_module213_module5.ClassAAH,
		param2: com.android.example.module06_module213_module5.ClassAAA
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

	}

	fun method2(
		param0: com.android.example.module06_module213_module5.ClassAAG,
		param1: com.android.example.module06_module213_module5.ClassAAG,
		param2: com.android.example.module06_module213_module5.ClassAAC,
		param3: com.android.example.module06_module213_module5.ClassAAH
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		param0.method1(io.reactivex.internal.schedulers.IoScheduler())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
