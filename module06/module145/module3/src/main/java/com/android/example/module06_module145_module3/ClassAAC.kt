package com.android.example.module06_module145_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module145_module6.ClassAAB = com.android.example.module06_module145_module6.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module145_module6.ClassAAJ = com.android.example.module06_module145_module6.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module145_module6.ClassAAH = com.android.example.module06_module145_module6.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module06_module145_module6.ClassAAG = com.android.example.module06_module145_module6.ClassAAG()

	fun method0(
		param0: com.android.example.module06_module145_module6.ClassAAB,
		param1: com.android.example.module06_module145_module6.ClassAAI
	) {
		for (iAb in 0..5) {
			param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.util.LinkedArrayList(27), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onNext(kotlin.Any())

				val local_var_4_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
				local_var_4_1.createWorker()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onComplete()

		}
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module145_module6.ClassAAD,
		param1: com.android.example.module06_module145_module6.ClassAAJ,
		param2: com.android.example.module06_module145_module6.ClassAAJ,
		param3: com.android.example.module06_module145_module6.ClassAAI
	) {
	}

	fun method2(
		param0: com.android.example.module06_module145_module6.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.onComplete()

	}

	fun method3(
		param0: com.android.example.module06_module145_module6.ClassAAF,
		param1: com.android.example.module06_module145_module6.ClassAAG,
		param2: com.android.example.module06_module145_module6.ClassAAG,
		param3: com.android.example.module06_module145_module6.ClassAAD
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isCancelled()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.isDisposed()

	}
}
