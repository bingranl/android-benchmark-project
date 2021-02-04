package com.android.example.module06_module284_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module284_module2.ClassAAC = com.android.example.module06_module284_module2.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module284_module5.ClassAAJ = com.android.example.module06_module284_module5.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module284_module5.ClassAAA = com.android.example.module06_module284_module5.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module06_module284_module2.ClassAAC = com.android.example.module06_module284_module2.ClassAAC()
	private 	val instance_var_1_4: com.android.example.module06_module284_module5.ClassAAB = com.android.example.module06_module284_module5.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module284_module5.ClassAAJ,
		param1: com.android.example.module06_module284_module2.ClassAAI
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

	}

	fun method1(
		param0: com.android.example.module06_module284_module2.ClassAAJ,
		param1: com.android.example.module06_module284_module5.ClassAAH,
		param2: com.android.example.module06_module284_module2.ClassAAB
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(-5523773203429143559)

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertNotSubscribed()

	}

	fun method2(
		param0: com.android.example.module06_module284_module5.ClassAAD,
		param1: com.android.example.module06_module284_module2.ClassAAA,
		param2: com.android.example.module06_module284_module5.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isCancelled()

		val local_var_2_5: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_5.createWorker()

	}
}
