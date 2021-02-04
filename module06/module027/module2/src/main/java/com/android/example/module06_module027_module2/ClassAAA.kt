package com.android.example.module06_module027_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module027_module1.ClassAAH = com.android.example.module06_module027_module1.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module027_module3.ClassAAE = com.android.example.module06_module027_module3.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module06_module027_module1.ClassAAB = com.android.example.module06_module027_module1.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module027_module3.ClassAAE = com.android.example.module06_module027_module3.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module027_module3.ClassAAH,
		param1: com.android.example.module06_module027_module3.ClassAAC,
		param2: com.android.example.module06_module027_module1.ClassAAH,
		param3: com.android.example.module06_module027_module1.ClassAAE
	) {
		val local_var_2_4: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_4.createWorker()

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

			local_var_3_0.dispose()

		}
		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.isDisposed()

	}

	fun method1(
		param0: com.android.example.module06_module027_module3.ClassAAD,
		param1: com.android.example.module06_module027_module1.ClassAAH
	) {
		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module06_module027_module3.ClassAAA,
		param1: com.android.example.module06_module027_module3.ClassAAE,
		param2: com.android.example.module06_module027_module1.ClassAAB,
		param3: com.android.example.module06_module027_module1.ClassAAF
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

	}

	fun method3(
		param0: com.android.example.module06_module027_module3.ClassAAB,
		param1: com.android.example.module06_module027_module1.ClassAAC
	) {
	}

	fun method4(
		param0: com.android.example.module06_module027_module1.ClassAAI,
		param1: com.android.example.module06_module027_module3.ClassAAD,
		param2: com.android.example.module06_module027_module1.ClassAAA,
		param3: com.android.example.module06_module027_module1.ClassAAC
	) {
		param0.method2(com.android.example.module06_module027_module3.ClassAAI(), com.android.example.module06_module027_module3.ClassAAF(), com.android.example.module06_module027_module3.ClassAAH())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}
}
