package com.android.example.module22_module01_module07_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module22_module01_module07_module1.ClassAAG = com.android.example.module22_module01_module07_module1.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module22_module01_module07_module1.ClassAAI = com.android.example.module22_module01_module07_module1.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module22_module01_module07_module3.ClassAAH = com.android.example.module22_module01_module07_module3.ClassAAH()

	fun method0(
		param0: com.android.example.module22_module01_module07_module1.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(-2968617733510560652)

	}

	fun method1(
		param0: com.android.example.module22_module01_module07_module3.ClassAAD,
		param1: com.android.example.module22_module01_module07_module1.ClassAAC,
		param2: com.android.example.module22_module01_module07_module1.ClassAAH
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(-5683428982276648252)

		param0.method3("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_5.assertNotSubscribed()

	}

	fun method2(
		param0: com.android.example.module22_module01_module07_module1.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.request(-141549641000390208)

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

	}

	fun method3(
		param0: com.android.example.module22_module01_module07_module3.ClassAAC,
		param1: com.android.example.module22_module01_module07_module3.ClassAAI,
		param2: com.android.example.module22_module01_module07_module1.ClassAAE
	) {
		param0.method2("SomeString", "SomeString")

	}
}
