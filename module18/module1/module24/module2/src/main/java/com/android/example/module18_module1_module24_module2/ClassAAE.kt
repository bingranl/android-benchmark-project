package com.android.example.module18_module1_module24_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module18_module1_module24_module1.ClassAAF = com.android.example.module18_module1_module24_module1.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module18_module1_module24_module1.ClassAAG = com.android.example.module18_module1_module24_module1.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module18_module1_module24_module3.ClassAAC = com.android.example.module18_module1_module24_module3.ClassAAC()
	private 	val instance_var_1_3: com.android.example.module18_module1_module24_module1.ClassAAB = com.android.example.module18_module1_module24_module1.ClassAAB()

	fun method0(
		param0: com.android.example.module18_module1_module24_module3.ClassAAD,
		param1: com.android.example.module18_module1_module24_module1.ClassAAI,
		param2: com.android.example.module18_module1_module24_module3.ClassAAD
	) {
	}

	fun method1(
		param0: com.android.example.module18_module1_module24_module3.ClassAAE,
		param1: com.android.example.module18_module1_module24_module3.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.dispose()

		}
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

		}
		param0.method1(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

	}

	fun method2(
		param0: com.android.example.module18_module1_module24_module1.ClassAAA,
		param1: com.android.example.module18_module1_module24_module1.ClassAAB,
		param2: com.android.example.module18_module1_module24_module3.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(4425341672829664116)

	}
}
