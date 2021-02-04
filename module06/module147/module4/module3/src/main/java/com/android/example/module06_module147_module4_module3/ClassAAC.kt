package com.android.example.module06_module147_module4_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAA = com.android.example.module06_module147_module4_module6.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAG = com.android.example.module06_module147_module4_module6.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module147_module4_module6.ClassAAE = com.android.example.module06_module147_module4_module6.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module06_module147_module4_module6.ClassAAH = com.android.example.module06_module147_module4_module6.ClassAAH()
	private 	val instance_var_1_4: com.android.example.module06_module147_module4_module6.ClassAAC = com.android.example.module06_module147_module4_module6.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAH
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.dispose()

				local_var_4_0.dispose()

			}
		}
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module6.ClassAAC,
		param1: com.android.example.module06_module147_module4_module6.ClassAAC,
		param2: com.android.example.module06_module147_module4_module6.ClassAAB,
		param3: com.android.example.module06_module147_module4_module6.ClassAAH
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.clear()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.onNext(kotlin.Any())

		val local_var_2_7: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_7.hasSubscription()

	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module6.ClassAAH
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}

	fun method3(
		param0: com.android.example.module06_module147_module4_module6.ClassAAC,
		param1: com.android.example.module06_module147_module4_module6.ClassAAC,
		param2: com.android.example.module06_module147_module4_module6.ClassAAA,
		param3: com.android.example.module06_module147_module4_module6.ClassAAA
	) {
		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.schedulers.IoScheduler(), io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.subscribers.TestSubscriber())

	}
}
