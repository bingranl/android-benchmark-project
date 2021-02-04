package com.android.example.module06_module337_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module06_module340_module3.ClassAAB = com.android.example.module06_module340_module3.ClassAAB()
		local_var_2_3.method2("SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..1) {
			param0.clear()

			val local_var_3_0: com.android.example.module06_module340_module3.ClassAAF = com.android.example.module06_module340_module3.ClassAAF()
			local_var_3_0.method4("SomeString")

		}
	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}
}
