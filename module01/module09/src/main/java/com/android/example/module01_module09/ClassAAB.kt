package com.android.example.module01_module09

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module121_module3.ClassAAG = com.android.example.module06_module121_module3.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module121_module3.ClassAAA = com.android.example.module06_module121_module3.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module121_module3.ClassAAA = com.android.example.module06_module121_module3.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module06_module121_module3.ClassAAA = com.android.example.module06_module121_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module121_module3.ClassAAC,
		param1: com.android.example.module06_module121_module3.ClassAAF,
		param2: com.android.example.module06_module121_module3.ClassAAF
	) {
	}

	fun method1(
		param0: com.android.example.module06_module121_module3.ClassAAH,
		param1: com.android.example.module06_module121_module3.ClassAAE,
		param2: com.android.example.module06_module121_module3.ClassAAH
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

		}
		for (iAb in 0..0) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
	}

	fun method2(
		param0: com.android.example.module06_module121_module3.ClassAAC,
		param1: com.android.example.module06_module121_module3.ClassAAJ
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		param0.method1(io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
