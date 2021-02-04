package com.android.example.module06_module145_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module145_module6.ClassAAB = com.android.example.module06_module145_module6.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module145_module6.ClassAAF = com.android.example.module06_module145_module6.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module145_module6.ClassAAD,
		param1: com.android.example.module06_module145_module6.ClassAAD
	) {
	}

	fun method1(
		param0: com.android.example.module06_module145_module6.ClassAAA
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.request(3399985162819323527)

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

		} else {
			param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable())

		}
	}

	fun method2(
		param0: com.android.example.module06_module145_module6.ClassAAH
	) {
	}

	fun method3(
		param0: com.android.example.module06_module145_module6.ClassAAE
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method4(
		param0: com.android.example.module06_module145_module6.ClassAAH,
		param1: com.android.example.module06_module145_module6.ClassAAB,
		param2: com.android.example.module06_module145_module6.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.clear()

	}
}
