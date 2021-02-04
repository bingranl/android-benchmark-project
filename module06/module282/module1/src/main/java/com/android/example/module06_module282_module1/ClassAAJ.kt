package com.android.example.module06_module282_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
	private 	val instance_var_1_2: com.android.example.module06_module342_module3.ClassAAB = com.android.example.module06_module342_module3.ClassAAB()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: com.android.example.module06_module342_module3.ClassAAG
	) {
	}

	fun method1(
		param0: com.android.example.module06_module342_module3.ClassAAH,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: com.android.example.module06_module342_module3.ClassAAE,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(-3940820502981595923)

		param0.method3("SomeString", "SomeString")

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onComplete()

	}
}
