package com.android.example.module06_module083_module10

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module083_module09.ClassAAH = com.android.example.module06_module083_module09.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module083_module09.ClassAAF = com.android.example.module06_module083_module09.ClassAAF()
	private 	val instance_var_1_2: com.android.example.module06_module083_module09.ClassAAH = com.android.example.module06_module083_module09.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module06_module083_module09.ClassAAA = com.android.example.module06_module083_module09.ClassAAA()
	private 	val instance_var_1_4: com.android.example.module06_module083_module09.ClassAAI = com.android.example.module06_module083_module09.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module083_module09.ClassAAA,
		param1: com.android.example.module06_module083_module09.ClassAAC
	) {
	}

	fun method1(
		param0: com.android.example.module06_module083_module09.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		param0.method1(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.isDisposed()

	}

	fun method2(
		param0: com.android.example.module06_module083_module09.ClassAAA,
		param1: com.android.example.module06_module083_module09.ClassAAF
	) {
		val local_var_2_2: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

	}

	fun method3(
		param0: com.android.example.module06_module083_module09.ClassAAD
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onNext(kotlin.Any())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

	}
}
