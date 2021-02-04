package com.android.example.module06_module145_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module145_module6.ClassAAF = com.android.example.module06_module145_module6.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module145_module6.ClassAAC = com.android.example.module06_module145_module6.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module06_module145_module6.ClassAAA = com.android.example.module06_module145_module6.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module145_module6.ClassAAH
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.clear()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.request(4718587439419501932)

		}
	}

	fun method1(
		param0: com.android.example.module06_module145_module6.ClassAAE
	) {
		param0.method4(io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module06_module145_module6.ClassAAG,
		param1: com.android.example.module06_module145_module6.ClassAAF
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}
}
