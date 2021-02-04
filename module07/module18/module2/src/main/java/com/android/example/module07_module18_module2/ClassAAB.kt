package com.android.example.module07_module18_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module07_module18_module3.ClassAAF = com.android.example.module07_module18_module3.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module07_module18_module3.ClassAAI = com.android.example.module07_module18_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module07_module18_module1.ClassAAB,
		param1: com.android.example.module07_module18_module3.ClassAAI,
		param2: com.android.example.module07_module18_module3.ClassAAE,
		param3: com.android.example.module07_module18_module1.ClassAAH
	) {
		for (iAb in 0..3) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.isCancelled()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.onError(kotlin.Throwable())

		}
	}

	fun method1(
		param0: com.android.example.module07_module18_module1.ClassAAD,
		param1: com.android.example.module07_module18_module1.ClassAAG,
		param2: com.android.example.module07_module18_module3.ClassAAI
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

	}

	fun method2(
		param0: com.android.example.module07_module18_module1.ClassAAB
	) {
		param0.method1(com.android.example.module07_module18_module3.ClassAAC(), com.android.example.module07_module18_module3.ClassAAE(), com.android.example.module07_module18_module3.ClassAAB())

		param0.method1(com.android.example.module07_module18_module3.ClassAAC(), com.android.example.module07_module18_module3.ClassAAE(), com.android.example.module07_module18_module3.ClassAAB())

		val local_var_2_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_1.start()

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

	}
}
