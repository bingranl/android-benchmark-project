package com.android.example.module06_module333_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAE = com.android.example.module06_module333_module5.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module333_module5.ClassAAC = com.android.example.module06_module333_module5.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module06_module333_module2.ClassAAB = com.android.example.module06_module333_module2.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module333_module2.ClassAAC = com.android.example.module06_module333_module2.ClassAAC()
	private 	val instance_var_1_4: com.android.example.module06_module333_module2.ClassAAA = com.android.example.module06_module333_module2.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module333_module2.ClassAAB,
		param1: com.android.example.module06_module333_module5.ClassAAD,
		param2: com.android.example.module06_module333_module2.ClassAAC
	) {
		param0.method3(com.android.example.module06_module333_module5.ClassAAE(), com.android.example.module06_module333_module5.ClassAAG(), com.android.example.module06_module333_module5.ClassAAC(), com.android.example.module06_module333_module5.ClassAAG())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

		param0.method1(com.android.example.module06_module333_module5.ClassAAJ(), com.android.example.module06_module333_module5.ClassAAF(), com.android.example.module06_module333_module5.ClassAAC())

	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAH
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber())

		param0.method3(io.reactivex.internal.util.AppendOnlyLinkedArrayList(87), io.reactivex.internal.disposables.ListCompositeDisposable())

	}

	fun method2(
		param0: com.android.example.module06_module333_module2.ClassAAE,
		param1: com.android.example.module06_module333_module2.ClassAAI
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

		param0.method1(com.android.example.module06_module333_module5.ClassAAI())

		param0.method2(com.android.example.module06_module333_module5.ClassAAD(), com.android.example.module06_module333_module5.ClassAAE(), com.android.example.module06_module333_module5.ClassAAB(), com.android.example.module06_module333_module5.ClassAAA())

	}
}
