package com.android.example.module06_module284_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module284_module5.ClassAAA = com.android.example.module06_module284_module5.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module284_module5.ClassAAG = com.android.example.module06_module284_module5.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module284_module2.ClassAAC = com.android.example.module06_module284_module2.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module284_module2.ClassAAI,
		param1: com.android.example.module06_module284_module2.ClassAAB,
		param2: com.android.example.module06_module284_module5.ClassAAB
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

		} else {
			param0.method1(com.android.example.module06_module284_module5.ClassAAF(), com.android.example.module06_module284_module5.ClassAAF())

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module284_module2.ClassAAF
	) {
	}

	fun method2(
		param0: com.android.example.module06_module284_module2.ClassAAC,
		param1: com.android.example.module06_module284_module2.ClassAAJ,
		param2: com.android.example.module06_module284_module5.ClassAAE
	) {
		val local_var_2_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_3.shutdown()

		param0.method0(com.android.example.module06_module284_module5.ClassAAI(), com.android.example.module06_module284_module5.ClassAAI(), com.android.example.module06_module284_module5.ClassAAD())

		param0.method0(com.android.example.module06_module284_module5.ClassAAI(), com.android.example.module06_module284_module5.ClassAAI(), com.android.example.module06_module284_module5.ClassAAD())

	}

	fun method3(
		param0: com.android.example.module06_module284_module5.ClassAAA
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.request(1209149503436379278)

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

	}
}
