package com.android.example.module07_module21_module02_module1_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module07_module21_module02_module1_module5.ClassAAF = com.android.example.module07_module21_module02_module1_module5.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module07_module21_module02_module1_module5.ClassAAA = com.android.example.module07_module21_module02_module1_module5.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module21_module02_module1_module5.ClassAAH = com.android.example.module07_module21_module02_module1_module5.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module07_module21_module02_module1_module5.ClassAAC = com.android.example.module07_module21_module02_module1_module5.ClassAAC()
	private 	val instance_var_1_4: com.android.example.module07_module21_module02_module1_module5.ClassAAA = com.android.example.module07_module21_module02_module1_module5.ClassAAA()

	fun method0(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAD,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAB,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAE
	) {
		val local_var_2_3: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_3.cancel()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isCancelled()

	}

	fun method1(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAA,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAH,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

		param0.method1(io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

	}

	fun method3(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAH,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAJ,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAA
	) {
	}

	fun method4(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAJ,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAB,
		param2: com.android.example.module07_module21_module02_module1_module5.ClassAAF,
		param3: com.android.example.module07_module21_module02_module1_module5.ClassAAB
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

	}
}
