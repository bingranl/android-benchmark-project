package com.android.example.module06_module213_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module213_module5.ClassAAB = com.android.example.module06_module213_module5.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module213_module5.ClassAAJ = com.android.example.module06_module213_module5.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module213_module5.ClassAAI = com.android.example.module06_module213_module5.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module213_module5.ClassAAG,
		param1: com.android.example.module06_module213_module5.ClassAAC,
		param2: com.android.example.module06_module213_module5.ClassAAG,
		param3: com.android.example.module06_module213_module5.ClassAAA
	) {
	}

	fun method1(
		param0: com.android.example.module06_module213_module5.ClassAAH,
		param1: com.android.example.module06_module213_module5.ClassAAC,
		param2: com.android.example.module06_module213_module5.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method2(
		param0: com.android.example.module06_module213_module5.ClassAAA,
		param1: com.android.example.module06_module213_module5.ClassAAH,
		param2: com.android.example.module06_module213_module5.ClassAAD,
		param3: com.android.example.module06_module213_module5.ClassAAH
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		param0.method4(io.reactivex.internal.util.AppendOnlyLinkedArrayList(19))

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.hasSubscription()

	}

	fun method3(
		param0: com.android.example.module06_module213_module5.ClassAAH,
		param1: com.android.example.module06_module213_module5.ClassAAE,
		param2: com.android.example.module06_module213_module5.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}
}
