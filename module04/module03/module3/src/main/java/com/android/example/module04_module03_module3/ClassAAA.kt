package com.android.example.module04_module03_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module04_module12_module6.ClassAAJ = com.android.example.module04_module12_module6.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module04_module12_module6.ClassAAC = com.android.example.module04_module12_module6.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module04_module12_module6.ClassAAH = com.android.example.module04_module12_module6.ClassAAH()

	fun method0(
		param0: com.android.example.module04_module12_module6.ClassAAH
	) {
	}

	fun method1(
		param0: com.android.example.module04_module12_module6.ClassAAI,
		param1: com.android.example.module04_module12_module6.ClassAAD,
		param2: com.android.example.module04_module12_module6.ClassAAC
	) {
	}

	fun method2(
		param0: com.android.example.module04_module12_module6.ClassAAD,
		param1: com.android.example.module04_module12_module6.ClassAAJ
	) {
	}

	fun method3(
		param0: com.android.example.module04_module12_module6.ClassAAC,
		param1: com.android.example.module04_module12_module6.ClassAAA,
		param2: com.android.example.module04_module12_module6.ClassAAI,
		param3: com.android.example.module04_module12_module6.ClassAAI
	) {
		for (iAb in 0..4) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onComplete()

		}
		for (iAc in 0..6) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.request(-1073657703485388350)

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.isCancelled()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.cancel()

			local_var_3_0.isDisposed()

		}
		param0.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.createWorker()

	}
}
